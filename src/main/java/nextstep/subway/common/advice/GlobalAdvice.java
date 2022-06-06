package nextstep.subway.common.advice;

import nextstep.subway.common.domain.ErrorResponse;
import nextstep.subway.line.exception.LineException;
import nextstep.subway.station.exception.StationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {
    @ExceptionHandler(LineException.class)
    public ResponseEntity<ErrorResponse> lineException(LineException ex) {
        return ResponseEntity.ok(new ErrorResponse(ex.getCode(), ex.getMessage()));
    }

    @ExceptionHandler(StationException.class)
    public ResponseEntity<ErrorResponse> stationException(StationException ex) {
        return ResponseEntity.ok(new ErrorResponse(ex.getCode(), ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exception(Exception e) {
        return ResponseEntity.ok(new ErrorResponse("Error", "서버 오류로 이용이 불가능 합니다."));
    }

}