### [033] Search in roated sorted array

1. For rotated sorted array, 
    - case 1: [left : mid] are sorted
    - case 2: [mid : right] are sorted
    - case 3: both [left : mid] and [mid : right] are sorted

2. For sorted part, e.g. [left : mid] are sorted

    if target is within value range of sorted part, then target is in this `sorted` part if exists; otherwise target is in `un-sorted` part 


