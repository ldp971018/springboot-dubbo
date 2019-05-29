package com.ldp.ticket.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Return
 * @create 2019-05-29 15:57
 */

@Component
@com.alibaba.dubbo.config.annotation.Service //将服务发布出去
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《破冰行动》";
    }
}
