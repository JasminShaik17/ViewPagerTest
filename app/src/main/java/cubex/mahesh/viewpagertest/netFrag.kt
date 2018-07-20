package cubex.mahesh.viewpagertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class  netFrag:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    var v = inflater.inflate(R.layout.net_frag,container,false)

    return  v
    }


}