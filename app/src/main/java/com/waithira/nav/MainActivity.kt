package com.waithira.nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title = "Navigation"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.drawermenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.profile ->
                Toast.makeText(this, "Profile selected", Toast.LENGTH_SHORT).show()
            R.id.db ->
                Toast.makeText(this, "Dashboared selected", Toast.LENGTH_SHORT).show()
            R.id.setting ->
                Toast.makeText(this, "Setting selected", Toast.LENGTH_SHORT).show()
            R.id.logout ->
                Toast.makeText(this, "Logout selected", Toast.LENGTH_SHORT).show()
            R.id.send ->
                Toast.makeText(this, "Send selected", Toast.LENGTH_SHORT).show()


        }
        return super.onOptionsItemSelected(item)
    }
}