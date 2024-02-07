package com.example.exoapi2.dto;

import com.example.exoapi2.entity.Status;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.exoapi2.entity.Task}
 */
@Value
public class TaskDTO implements Serializable {
    String content;
    Status status;
}