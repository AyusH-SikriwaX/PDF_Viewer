package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        pdfView = findViewById(R.id.pdfView);

        // Load PDF from assets with error handling
        try {
            pdfView.fromAsset("Sustainability milestones!.pdf").load();
        } catch (Exception e) {
            e.printStackTrace();
            // Optionally, you can show a message to the user here
        }
    }
}

