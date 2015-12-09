//
//  DataViewController.h
//  SolarSystemClockIOS
//
//  Created by Anand Tyagi on 6/10/15.
//  Copyright (c) 2015 Anand Tyagi. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface DataViewController : UIViewController

@property (strong, nonatomic) IBOutlet UILabel *dataLabel;
@property (strong, nonatomic) id dataObject;

@end

