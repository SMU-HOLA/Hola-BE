package smu.hola.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum Status {
    OK(HttpStatus.OK,"OK"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST,"BAD_REQUEST"),
    FORBIDDEN(HttpStatus.FORBIDDEN,"FORBIDDEN"),
    NOT_FOUND(HttpStatus.NOT_FOUND,"NOT_FOUND"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR"),
    SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE,"SERVICE_UNAVAILABLE");

    private final HttpStatus httpStatus;
    private final String message;

}
