//
//  YesNicole.swift
//  I Love Nicole
//
//  Created by Anand Tyagi on 6/8/17.
//  Copyright © 2017 Anand Tyagi. All rights reserved.
//

import UIKit

class YesNicole: UIViewController {

    @IBOutlet weak var Prompt: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
        Prompt.text = "ANAND LOVES YOU NICOLE!!! Thank you for being in his life. He is very very greatful for you. You are the best girlfriend in the whole world. He loves you very very much :)"

    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
