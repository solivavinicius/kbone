package br.com.esmbusiness.service

import br.com.esmbusiness.auth.User;
import br.com.esmbusiness.domain.Event
import br.com.esmbusiness.domain.EventType;
import br.com.esmbusiness.domain.Tag

class EventService {

    def save(Long userId, Long kUnitId, Long tagId, Integer typeCode) {
        def event = new Event(userId:userId, kUnitId:kUnitId, tagId:tagId, typeCode:typeCode)
        event.save(flush:true)
    }
}
