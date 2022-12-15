package com.example.madfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import java.text.DecimalFormat

class Screen3 : AppCompatActivity() {

    lateinit var scroll: ScrollView
    lateinit var scrollText: TextView
    lateinit var dateOutput: TextView
    lateinit var emailOutput: TextView
    lateinit var choiceOutput: TextView
    lateinit var chocoCakeImg: ImageView
    lateinit var cookieImg:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        //intents
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val choice = intent.getStringExtra("EXTRA_CHOICE")
        val date = intent.getStringExtra("EXTRA_DATE")

        //setting the variables
        scroll = findViewById(R.id.scroll_view)
        scrollText = findViewById(R.id.scroll_text)
        dateOutput = findViewById(R.id.date_output)
        emailOutput = findViewById(R.id.email_output)
        choiceOutput = findViewById(R.id.choice_view)
        chocoCakeImg = findViewById(R.id.chocoCake)
        cookieImg = findViewById(R.id.cookie)


        //text output for date, email, and choice
        var dateText = "Date: $date"
        dateOutput.text = dateText

        var emailText = "Email: $email"
        emailOutput.text = emailText

        var choiceText = "You chose: $choice"
        choiceOutput.text = choiceText


        //text output for scrollview & displays images
        if (choice == "Moist Chocolate Cake"){
            scrollText.text = "Ingredients:\n" +
                    "2 cups all-purpose flour\n" +
                    "2 cups sugar\n" +
                    "2 teaspoons baking soda\n" +
                    "3/4 cup baking cocoa\n" +
                    "1 teaspoon salt\n" +
                    "1 teaspoon baking powder\n" +
                    "1 cup canola oil\n" +
                    "1 cup brewed coffee\n" +
                    "1 cup whole milk\n" +
                    "2 large eggs\n" +
                    "1 teaspoon vanilla extract\n" +
                    "For Icing:\n" +
                    "5 tablespoons all-purpose flour\n" +
                    "1 cup whole milk\n" +
                    "1/2 cup butter, softened\n" +
                    "1/2 cup shortening\n" +
                    "1 cup sugar\n" +
                    "1 teaspoon vanilla extract\n" +
                    "2 to 4 tablespoons sprinkles, optional\n" +
                    " \n"+
                    "Directions: \n" +
                    "1. Preheat oven to 325°. Grease and flour two 9-in. round \n" +
                    "baking pans. Sift dry ingredients together into a large bowl.\n" +
                    " Add oil, coffee and milk; mix at medium speed 1 minute. Add \n" +
                    "eggs and vanilla; beat 2 minutes longer. (Batter will be thin.)\n" +
                    " Pour into prepared pans.\n" +
                    "2. Bake until a toothpick inserted in the center comes out clean,\n" +
                    " 25-30 minutes. Cool in pans 10 minutes before removing to wire \n" +
                    "racks to cool completely.\n" +
                    "3. Meanwhile, for icing, in a small saucepan, whisk flour and milk \n" +
                    "until smooth. Bring to a boil over medium heat; cook and stir until\n" +
                    " thickened, 1-2 minutes. Transfer to a small bowl. Cover and \n" +
                    "refrigerate until chilled.\n" +
                    "4. In a large bowl, beat butter, shortening, sugar and vanilla\n" +
                    " until creamy, 3-4 minutes. Add chilled milk mixture and beat \n" +
                    "10 minutes. Stir in sprinkles if desired. Spread frosting\n" +
                    " between layers and over top and sides of cake. If desired, \n" +
                    "dust with additional cocoa."
        }
        if (choice == "Sugar Cookie"){
            scrollText.text = "Ingredients: \n" +
                    "2 ¾ cups all-purpose flour\n" +
                    "1 teaspoon baking soda\n" +
                    "½ teaspoon baking powder\n" +
                    "1 cup butter, softened\n" +
                    "1 ½ cups white sugar\n" +
                    "1 egg\n" +
                    "1 teaspoon vanilla extract\n" +
                    "\n" +
                    "Directions: \n" +
                    "1. Preheat the oven to 375 degrees F (190 degrees C).\n" +
                    "2. Stir flour, baking soda, and baking powder together\n" +
                    " in a small bowl.\n" +
                    "3. Beat sugar and butter together in a large bowl with \n" +
                    "an electric mixer until smooth. Beat in egg and vanilla. \n" +
                    "Gradually blend in flour mixture. Roll dough into walnut\n" +
                    "-sized balls and place 2 inches apart onto ungreased \n" +
                    "baking sheets.\n" +
                    "4. Bake in the preheated oven until edges are golden,\n" +
                    " 8 to 10 minutes. Cool on the baking sheets briefly \n" +
                    "before removing to a wire rack to cool completely.\n"
        }
        if (choice == "Moist Vanilla Cupcakes"){
            scrollText.text = "Indredients:\n" +
                    "2 1/2 cups (325g) all purpose flour\n" +
                    "2 cups (414g) sugar\n" +
                    "3 tsp baking powder\n" +
                    "1 tsp salt\n" +
                    "1 cup (240ml) milk\n" +
                    "1/2 cup (120ml) vegetable oil\n" +
                    "1 tbsp vanilla extract\n" +
                    "2 large eggs\n" +
                    "1 cup (240ml) water\n" +
                    "\n" +
                    "Directions: \n" +
                    "1. Preheat oven to 350°F (176°C) and prepare a cupcake\n" +
                    " pan with liners.\n" +
                    "2. Add the flour, sugar, baking powder and salt to a large\n " +
                    "mixer bowl and combine. Set aside.\n" +
                    "3. Add the milk, vegetable oil, vanilla extract and eggs \n" +
                    "to a medium sized bowl and combine.\n" +
                    "4. Add the wet ingredients to the dry ingredients and beat\n" +
                    " until well combined.\n" +
                    "5. Slowly add the water to the batter and mix on low speed \n" +
                    "until well combined. Scrape down the sides of the bowl as \n" +
                    "needed to make sure everything is well combined. Please note \n" +
                    "that the batter will be very thin.\n" +
                    "6. Fill the cupcake liners about half way and bake for 15-17 \n" +
                    "minutes, or until a toothpick comes out with a few moist crumbs.\n" +
                    "7. Remove the cupcakes from oven and allow to cool for 2 minutes,\n" +
                    " then remove to a cooling rack to finish cooling."
        }


    }
}