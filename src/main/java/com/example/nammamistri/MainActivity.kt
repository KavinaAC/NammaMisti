package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // ಸಾಮಗ್ರಿ ಲೆಕ್ಕಾಚಾರ

        findViewById<LinearLayout>(R.id.materialCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಸಾಮಗ್ರಿ ಲೆಕ್ಕಾಚಾರ ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, MaterialCalculatorActivity::class.java)
            )
        }

        // ಯೋಜನೆ ಅಂದಾಜು

        findViewById<LinearLayout>(R.id.projectCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಯೋಜನೆ ಅಂದಾಜು ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, ProjectEstimationActivity::class.java)
            )
        }

        // ಕಾರ್ಮಿಕ ಲೆಕ್ಕಾಚಾರ

        findViewById<LinearLayout>(R.id.labourCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಕಾರ್ಮಿಕ ಲೆಕ್ಕಾಚಾರ ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, LabourCalculatorActivity::class.java)
            )
        }

        // ದರ ವಿಶ್ಲೇಷಣೆ

        findViewById<LinearLayout>(R.id.rateCard).setOnClickListener {

            Toast.makeText(
                this,
                "ದರ ವಿಶ್ಲೇಷಣೆ ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, RateAnalysisActivity::class.java)
            )
        }

        // ಸೈಟ್ ಟಿಪ್ಪಣಿಗಳು

        findViewById<LinearLayout>(R.id.siteCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಸೈಟ್ ಟಿಪ್ಪಣಿಗಳು ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, SiteNotesActivity::class.java)
            )
        }

        // ಘಟಕ ಪರಿವರ್ತಕ

        findViewById<LinearLayout>(R.id.unitCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಘಟಕ ಪರಿವರ್ತಕ ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, UnitConverterActivity::class.java)
            )
        }

        // ಬುಕ್ಕಿಂಗ್

        findViewById<LinearLayout>(R.id.bookingCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಬುಕ್ಕಿಂಗ್ ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, BookingActivity::class.java)
            )
        }

        // ನನ್ನ ಯೋಜನೆಗಳು

        findViewById<LinearLayout>(R.id.projectsCard).setOnClickListener {

            Toast.makeText(
                this,
                "ನನ್ನ ಯೋಜನೆಗಳು ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, MyProjectsActivity::class.java)
            )
        }

        // ಪ್ರೊಫೈಲ್

        findViewById<LinearLayout>(R.id.profileCard).setOnClickListener {

            Toast.makeText(
                this,
                "ಪ್ರೊಫೈಲ್ ತೆರೆಯಲಾಗಿದೆ",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, ProfileActivity::class.java)
            )
        }

        // ಬಾಟಮ್ ನ್ಯಾವಿಗೇಶನ್

        val bottomNavigation =
            findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNavigation.setOnItemSelectedListener {

            when (it.itemId) {

                // ಮುಖಪುಟ

                R.id.nav_home -> {

                    Toast.makeText(
                        this,
                        "ಮುಖಪುಟ",
                        Toast.LENGTH_SHORT
                    ).show()

                    true
                }

                // ಯೋಜನೆಗಳು

                R.id.nav_projects -> {

                    startActivity(
                        Intent(
                            this,
                            MyProjectsActivity::class.java
                        )
                    )

                    true
                }

                // ಕಾರ್ಮಿಕ

                R.id.nav_labour -> {

                    startActivity(
                        Intent(
                            this,
                            LabourCalculatorActivity::class.java
                        )
                    )

                    true
                }

                // ಪ್ರೊಫೈಲ್

                R.id.nav_profile -> {

                    startActivity(
                        Intent(
                            this,
                            ProfileActivity::class.java
                        )
                    )

                    true
                }

                else -> false
            }
        }
    }
}