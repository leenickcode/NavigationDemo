package com.hutlon.navigationdemo


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_blank.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Navigation.findNavController(view)
        val bundle =Bundle()
        bundle.putString("name","lee")
        val action = BlankFragmentDirections.actionBlankFragmentToSecondeFragment("hello")
        button.setOnClickListener {
            //id就是nav_graph导航图里面的action id，就和startActivty一样
//            Navigation.findNavController(view).navigate(R.id.action_blankFragment_to_secondeFragment,bundle)
            safeMode()
        }
        for (i in 1..5){
            val numcode = ((Math.random() * 9 + 1) * 100000).toInt()
            val smstext = "你本次生成的6位安全验证码为：$numcode"
            Log.d("aaa",smstext)
        }
    }
    fun  safeMode(){
        val action = BlankFragmentDirections.actionBlankFragmentToSecondeFragment("hello")
        Navigation.findNavController(view!!).navigate(action)
    }
}
