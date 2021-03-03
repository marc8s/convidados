package com.example.convidados.service.repository

import com.example.convidados.service.model.GuestModel

//CRUD

class GuestRepository {
    fun getAll(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }
    fun getPresent(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }
    fun getAbsent(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }
    fun save(guest: GuestModel){

    }
    fun update(guest: GuestModel){

    }
    fun delete(guest: GuestModel){

    }
}