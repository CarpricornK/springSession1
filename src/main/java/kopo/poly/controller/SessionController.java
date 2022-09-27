package kopo.poly.controller;

import kopo.poly.util.CmmUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
public class SessionController {

    @GetMapping("/session/test")
    public String sessionTest(HttpSession session) {

        log.info(this.getClass().getName() + ".sessionTest Start!");

        String sessionId = session.getId();

        session.setAttribute("test", "1234");

        String test = CmmUtil.nvl((String) session.getAttribute("test"));

        log.info("test : " + test);

        log.info(this.getClass().getName() + ".sessionTest End!");

        return sessionId;
    }


}
