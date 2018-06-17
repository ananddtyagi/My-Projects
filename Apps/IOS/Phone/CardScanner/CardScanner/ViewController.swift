//
//  ViewController.swift
//  CardScanner
//
//  Created by Anand Tyagi on 5/28/18.
//  Copyright © 2018 Anand Tyagi. All rights reserved.
//

import UIKit
import AVFoundation

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        //starting the camera
        
        let captureSession = AVCaptureSession()
        
        guard let captureDevice = AVCaptureDevice.defaultDevice(withMediaType: AVMediaTypeVideo)
            else {return}
        guard let input = try? AVCaptureDeviceInput(device: captureDevice) else {return}
        captureSession.addInput(input)
        
        captureSession.startRunning()
        
        let previewLayer = AVCaptureVideoPreviewLayer(session: captureSession)
        
        view.layer(
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

