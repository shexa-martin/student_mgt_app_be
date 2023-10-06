package zw.ac.shexatech.student_mgt_app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MyExceptions extends Exception{

    public MyExceptions(String msg){
        super(msg);
    }
}
