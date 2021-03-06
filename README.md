# ScheduleApp
- 달/월/일 달력 CustomView를 TabLayout으로 구성
- 일정추가 등 Android 내 DB CRUD를 Android Room을 사용하여 구현

## 초기화면
- 1.3초 후 탭뷰 레이아웃으로 전환됩니다.
- 앱을 켜면 최근에 앱 종료 시 보고 있었던 탭이 표시됩니다.

## Monthly 탭
- 위 아래로 스위핑하여 다른 달의 달력을 볼 수 있습니다.
- 달력의 날짜(일)을 선택하면 작은 원이 선택된 날짜로 이동합니다.
- 우측 하단에 플로팅 액션 버튼으로 새로운 일정을 추가할 수 있습니다. 새로운 일정의 기본값은 선택된 날짜가 들어갑니다.

## Weekly 탭, Daily 탭
- 조작법은 Monthly와 같고, 다른 점은 달력 하단에서 등록된 이번 주/오늘 일정 목록을 확인할 수 있습니다.

## 새로운 일정 등록하기
- 아무 탭에서 우측 하단 플로팅 액션 버튼을 누르면 새로운 일정을 추가하는 액티비티가 나타납니다.
- 내용을 한 자라도 입력해야만 일정을 저장할 수 있습니다. 날짜는 기본값으로 각 탭에서 선택된 날짜가 설정되어 있고 DatePicker뷰로 년/월/일을 수정할 수 있습니다.

## 등록된 일정 확인
- Android 내 DB인 SQLite에 저장된 일정을 확인할 수 있습니다.

## 등록된 일정 수정
- 등록된 일정은 Weekly, Daily 탭에서 리스트 항목을 클릭하여 내용 및 날짜를 수정하거나 삭제할 수 있습니다.
