# AndroidEventStudy
이벤트 처리 공부하기


# 이벤트 처리 이해하기


|속성|설명|
|------|---|
|터치 이벤트|화면을 손가락으로 누를 때 발생하는 이벤트|
|키 이벤트|키패드나 하드웨어 버튼을 누를 때 발생하는 이벤트|
|제스처 이벤트|터치 이벤트 중에서 스크롤과 같이 일정 패턴으로 구분되는 이벤트|
|포커스|뷰마다 순서대로 주어지는 포커스|
|화면 방향 변경|화면의 방향이 가로와 세로로 바뀜에 따라 발생하는 이벤트|



# 터치 이벤트 
|메서드|이벤트 유형|
|------|---|
|onDown()|화면이 눌렸을 경우|
|onShowPress()|화면이 눌렸다 떼어지는 경우|
|onSingleTapUp()|화면이 한 손가락으로 눌렸다 떼어지는 경우|
|onSingleTapConfirmed()|화면이 한 손가락으로 눌려지는 경우|
|onDoubleTap()|화면이 두 손가락으로 눌려지는 경우|
|onDownTapEvent()|화면이 두 손가락으로 눌려진 상태에서 떼거나 이동하는 등 세부적인 액션을 취하는 경우|
|onScroll()|화면이 눌린 채 일정한 속도와 방향으로 움직였다 떼는 경우|
|onFling()|화면이 눌린 채 가속도를 붙여 손가락을 움직였다 떼는 경우|
|onLongPress()|화면을 손가락으로 오래 누르는 경우|



# 키 이벤트 
|키 코드|설명|
|------|---|
|KEYCODE_DPAD_LEFT|왼쪽 화살표|
|KEYCODE_DPAD_RIGHT|오른쪽 화살표|
|KEYCODE_DPAD_UP|위쪽 화살표|
|KEYCODE_DPAD_DOWN|아래쪽 화살표|
|KEYCODE_DPAD_CENTER|[중앙] 버튼|
|KEYCODE_CALL|[통화] 화살표|
|KEYCODE_ENDCALL|[통화 종료] 화살표|
|KEYCODE_BACK|[뒤로 가기] 화살표|
|KEYCODE_VOLUME_UP|[소리 크기 증가] 화살표|
|KEYCODE_VOLUME_DOWN|[소리 크기 감소] 화살표|
|KEYCODE_0 ~ KEYCODE_9|숫자 0부터 9까지의 키 값|
|KEYCODE_A ~ KEYCODE_Z|알파벳 A부터 Z까지의 키 값|
