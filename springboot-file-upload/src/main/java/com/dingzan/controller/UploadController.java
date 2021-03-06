package com.dingzan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class UploadController {
    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "D://temp//";

    @GetMapping("/")
    public String index() {
        return "upload";
    }

    @PostMapping("/upload")
    public String singleFileUpload(MultipartFile[] files,
                                   RedirectAttributes redirectAttributes) {
		for(int i=0;i<files.length;i++) {
			if (files.length==0) {
				redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            return "redirect:uploadStatus";
			}
			try {
	            // Get the file and save it somewhere
	            byte[] bytes = files[i].getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + files[i].getOriginalFilename());
	            Files.write(path, bytes);

	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + files[i].getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}

        return "redirect:/uploadStatus";
    }

    
    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

}