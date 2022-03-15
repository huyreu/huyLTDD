import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ktragiuaki.Data
import com.example.ktragiuaki.R

class Adapter(private val dataSet: List<Data>)
    : RecyclerView.Adapter<Adapter.ViewHolderItem>() {

    inner class ViewHolderItem(view: View) : RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.cap)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemms, null)
        return ViewHolderItem(view)
    }
    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val item = dataSet[position]
        holder.name.text = item.cap
    }
    override fun getItemCount() : Int = dataSet.size

}