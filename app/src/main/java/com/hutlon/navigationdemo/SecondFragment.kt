package com.hutlon.navigationdemo


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var name = arguments?.getString("name")
        var name1 = SecondFragmentArgs.fromBundle(arguments!!).name
        Log.d("aaa",   SecondFragmentArgs.fromBundle(arguments!!).name)
            btn_back.setOnClickListener {
                Navigation.findNavController(it).navigateUp()
            }
        btn_next.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_secondeFragment_to_threeFragment)
        }
    }
}
