package com.luckysj.chatgpt.data.trigger.http.dto;

import lombok.Data;

/**
 * @author www.luckysj.top 刘仕杰
 * @description
 * @create 2023/12/04 19:29:22
 */
@Data
public class ChoiceEntity {

    /** stream = true 请求参数里返回的属性是 delta */
    private MessageEntity delta;
    /** stream = false 请求参数里返回的属性是 delta */
    private MessageEntity message;

}
