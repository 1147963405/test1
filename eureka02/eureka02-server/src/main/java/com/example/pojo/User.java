package com.example.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

   private static final long  serivalVersionUID=7260598142983180828L;

   private String id;
   private String username;
   private String password;
}
