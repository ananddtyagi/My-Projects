//
//  ModelController.h
//  SolarSystemClockIOS
//
//  Created by Anand Tyagi on 6/10/15.
//  Copyright (c) 2015 Anand Tyagi. All rights reserved.
//

#import <UIKit/UIKit.h>

@class DataViewController;

@interface ModelController : NSObject <UIPageViewControllerDataSource>

- (DataViewController *)viewControllerAtIndex:(NSUInteger)index storyboard:(UIStoryboard *)storyboard;
- (NSUInteger)indexOfViewController:(DataViewController *)viewController;

@end

