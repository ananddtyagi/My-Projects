//
//  YesAnand.swift
//  I Love Nicole
//
//  Created by Anand Tyagi on 6/8/17.
//  Copyright © 2017 Anand Tyagi. All rights reserved.
//

import UIKit

class YesAnand: UIViewController {

    @IBOutlet weak var prompt: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
        prompt.text = "You love Nicole, and I don't even have to tell you this, because you know it, in your heart."
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
