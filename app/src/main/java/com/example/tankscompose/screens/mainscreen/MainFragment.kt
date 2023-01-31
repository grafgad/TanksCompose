package com.example.tankscompose.screens.mainscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig

class MainFragment : Fragment() {

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        return binding.root
//    }

    //как перетащить Firebase в compose?
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = Firebase.remoteConfig.getString("title")
        //binding.welcomeText.text = title
    }
}