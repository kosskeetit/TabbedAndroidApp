package com.example.coronaapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coronaapp.Item

import com.example.coronaapp.R
import com.example.tabbedcoronaapp.CustomAdapter
import kotlinx.android.synthetic.main.chat_fragement.*


/**
 * A simple [Fragment] subclass.
 * Use the [ChatFragement.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatFragement : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.chat_fragement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        create an array that will inflate the layout
        val chats : ArrayList<Item> = ArrayList()

        chats.add(Item(R.drawable.coro,"John Doe","Programming is awesome","11:00am"))

        chatList.adapter = this@ChatFragement.context?.let {
            CustomAdapter(
                it, chats
            )
        }

        super.onViewCreated(view, savedInstanceState)
    }
}
