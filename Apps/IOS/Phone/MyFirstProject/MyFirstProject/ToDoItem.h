//
//  ToDoItem.h
//  MyFirstProject
//
//  Created by Anand Tyagi on 6/10/15.
//  Copyright (c) 2015 Anand Tyagi. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface ToDoItem : NSObject

@property NSString *itemName;
@property BOOL completed;
@property (readonly) NSDate *creationDate;

@end
