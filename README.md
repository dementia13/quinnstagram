# Project 3 - *Quinnstagram*

**Quinnstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **8** hours spent in total

## User Stories

The following **required** functionality is completed:

- [ ] User can sign up to create a new account using Parse authentication.
- [x] User can log in and log out of his or her account.
- [x] The current signed in user is persisted across app restarts.
- [x] User can take a photo, add a caption, and post it to "Instagram".

The following **optional** features are implemented:

- [x] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse.

The following **additional** features are implemented:

- [x] List anything else that you can get done to improve the app functionality!
- Used a Constraint Layout

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://submissions.us-east-1.linodeobjects.com/android_university/6RNIqp2y.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [ScreenToGIF]).

## Notes

Began with stretch features because I couldn't stand the way the bare-bones app looked. 
This means that I ran out of time to get user sign-up working. I had difficulty getting the two toolbars to display diffently.
I wanted to have logout on a separate screen selected by the user button on the bottom toolbar, but I couldn't get that button working. This feature
will be included, along with user sign-up, in next week's submission

# Quinnstagram, part 2

Time spent: **9** hours spent in total

## User Stories

The following **required** functionality is completed:

- [ ] User can view the last 20 posts submitted to "Instagram".
- [ ] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos form camera) and profile tabs (posts made) using fragments and a Bottom Navigation View. (2 points)
- [ ] User can pull to refresh the last 20 posts submitted to "Instagram".

The following **optional** features are implemented:

- [X] User sees app icon in home screen and styled bottom navigation view
- [X] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once he or she reaches the bottom of the feed using infinite scrolling.
- [ ] Show the username and creation time for each post.
- [ ] User can tap a post to view post details, including timestamp and caption.
- [ ] User Profiles
      - [ ] Allow the logged in user to add a profile photo
      - [ ] Display the profile photo with each post
      - [ ] Tapping on a post's username or profile photo goes to that user's profile page and shows a grid view of the user's posts 
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [X] List anything else that you can get done to improve the app functionality!
- Implemented the new user signup that was left off from last week

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.
- Trouble implementing signup because I was sending the password where the email belonged. Typo
- Placed the "logout" button on the user profile fragment, and had trouble implementing navigation from the fragment back to the login activity
- A lot of trouble with buttons sliding around the bottom navigation bar and going invisible

## Open-source libraries used

- [Parse Platform](https://parseplatform.org/) - REST server
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

