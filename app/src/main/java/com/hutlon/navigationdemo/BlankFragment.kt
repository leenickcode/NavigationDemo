package com.hutlon.navigationdemo


import android.os.Bundle
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

        button.setOnClickListener {
            //id就是nav_graph导航图里面的action id，就和startActivty一样
            Navigation.findNavController(view).navigate(R.id.action_blankFragment_to_secondeFragment,bundle)
        }
    }
    fun  safeMode(){
        val action = BlankFragmentDirections.actionBlankFragmentToSecondeFragment("aa")
        Navigation.findNavController(view!!).navigate(action)
    }
}
