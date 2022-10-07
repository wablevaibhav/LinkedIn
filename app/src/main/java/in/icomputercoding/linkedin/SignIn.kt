package `in`.icomputercoding.linkedin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signIn: AppCompatButton = findViewById(R.id.signIn)
        signIn.setOnClickListener {
            val intent = Intent(this,SignInLayout::class.java)
            startActivity(intent)
        }

    }
}