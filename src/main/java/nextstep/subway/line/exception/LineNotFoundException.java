package nextstep.subway.line.exception;

import nextstep.subway.excetpion.ErrorCode;

public class LineNotFoundException extends RuntimeException{

    private ErrorCode errorCode;

    public LineNotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public LineNotFoundException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}