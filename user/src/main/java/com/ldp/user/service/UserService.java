package com.ldp.user.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.dubbo.config.annotation.Reference;
import com.ldp.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author Return
 * @create 2019-05-29 16:04
 */
@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket=ticketService.getTicket();
        System.out.println("买到票了"+ticket);
    }
}
