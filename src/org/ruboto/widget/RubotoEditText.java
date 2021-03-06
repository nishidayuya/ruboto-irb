package org.ruboto.widget;

import org.jruby.Ruby;
import org.jruby.javasupport.util.RuntimeHelpers;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.javasupport.JavaUtil;
import org.jruby.exceptions.RaiseException;
import org.ruboto.Script;

public class RubotoEditText extends android.widget.EditText {
  private Ruby __ruby__;

  public static final int CB_PRE_DRAW = 0;
  public static final int CB_RESTORE_INSTANCE_STATE = 1;
  public static final int CB_SAVE_INSTANCE_STATE = 2;
  public static final int CB_TEXT_CHANGED = 3;
  public static final int CB_BEGIN_BATCH_EDIT = 4;
  public static final int CB_COMMIT_COMPLETION = 5;
  public static final int CB_EDITOR_ACTION = 6;
  public static final int CB_END_BATCH_EDIT = 7;
  public static final int CB_PRIVATE_I_M_E_COMMAND = 8;
  public static final int CB_SELECTION_CHANGED = 9;
  public static final int CB_TEXT_CONTEXT_MENU_ITEM = 10;
  public static final int CB_ANIMATION_END = 11;
  public static final int CB_ANIMATION_START = 12;
  public static final int CB_ATTACHED_TO_WINDOW = 13;
  public static final int CB_CREATE_CONTEXT_MENU = 14;
  public static final int CB_CREATE_DRAWABLE_STATE = 15;
  public static final int CB_DETACHED_FROM_WINDOW = 16;
  public static final int CB_DRAW = 17;
  public static final int CB_FINISH_INFLATE = 18;
  public static final int CB_FOCUS_CHANGED = 19;
  public static final int CB_KEY_DOWN = 20;
  public static final int CB_KEY_MULTIPLE = 21;
  public static final int CB_KEY_SHORTCUT = 22;
  public static final int CB_KEY_UP = 23;
  public static final int CB_LAYOUT = 24;
  public static final int CB_MEASURE = 25;
  public static final int CB_SCROLL_CHANGED = 26;
  public static final int CB_SET_ALPHA = 27;
  public static final int CB_SIZE_CHANGED = 28;
  public static final int CB_TOUCH_EVENT = 29;
  public static final int CB_TRACKBALL_EVENT = 30;
  public static final int CB_WINDOW_FOCUS_CHANGED = 31;
  public static final int CB_WINDOW_VISIBILITY_CHANGED = 32;
  public static final int CB_CHECK_IS_TEXT_EDITOR = 33;
  public static final int CB_CREATE_INPUT_CONNECTION = 34;
  public static final int CB_FINISH_TEMPORARY_DETACH = 35;
  public static final int CB_KEY_PRE_IME = 36;
  public static final int CB_START_TEMPORARY_DETACH = 37;
  public static final int CB_KEY_LONG_PRESS = 38;
  public static final int CB_CONFIGURATION_CHANGED = 39;
  public static final int CB_DISPLAY_HINT = 40;
  public static final int CB_VISIBILITY_CHANGED = 41;
  private IRubyObject[] callbackProcs = new IRubyObject[42];

  public  RubotoEditText(android.content.Context context) {
    super(context);
  }

  public  RubotoEditText(android.content.Context context, android.util.AttributeSet attrs) {
    super(context, attrs);
  }

  public  RubotoEditText(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  private Ruby getRuby() {
    if (__ruby__ == null) __ruby__ = Script.getRuby();
    return __ruby__;
  }

  public void setCallbackProc(int id, IRubyObject obj) {
    callbackProcs[id] = obj;
  }
	
  public boolean onPreDraw() {
    if (callbackProcs[CB_PRE_DRAW] != null) {
      super.onPreDraw();
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_PRE_DRAW], "call" ).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onPreDraw();
    }
  }

  public void onRestoreInstanceState(android.os.Parcelable state) {
    if (callbackProcs[CB_RESTORE_INSTANCE_STATE] != null) {
      super.onRestoreInstanceState(state);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_RESTORE_INSTANCE_STATE], "call" , JavaUtil.convertJavaToRuby(getRuby(), state));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onRestoreInstanceState(state);
    }
  }

  public android.os.Parcelable onSaveInstanceState() {
    if (callbackProcs[CB_SAVE_INSTANCE_STATE] != null) {
      super.onSaveInstanceState();
      try {
        return (android.os.Parcelable)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_SAVE_INSTANCE_STATE], "call" ).toJava(android.os.Parcelable.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return null;
      }
    } else {
      return super.onSaveInstanceState();
    }
  }

  public void onTextChanged(java.lang.CharSequence text, int start, int before, int after) {
    if (callbackProcs[CB_TEXT_CHANGED] != null) {
      super.onTextChanged(text, start, before, after);
      try {
        IRubyObject[] args = {JavaUtil.convertJavaToRuby(getRuby(), text), JavaUtil.convertJavaToRuby(getRuby(), start), JavaUtil.convertJavaToRuby(getRuby(), before), JavaUtil.convertJavaToRuby(getRuby(), after)};
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_TEXT_CHANGED], "call" , args);
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onTextChanged(text, start, before, after);
    }
  }

  public void onBeginBatchEdit() {
    if (callbackProcs[CB_BEGIN_BATCH_EDIT] != null) {
      super.onBeginBatchEdit();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_BEGIN_BATCH_EDIT], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onBeginBatchEdit();
    }
  }

  public void onCommitCompletion(android.view.inputmethod.CompletionInfo text) {
    if (callbackProcs[CB_COMMIT_COMPLETION] != null) {
      super.onCommitCompletion(text);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_COMMIT_COMPLETION], "call" , JavaUtil.convertJavaToRuby(getRuby(), text));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onCommitCompletion(text);
    }
  }

  public void onEditorAction(int actionCode) {
    if (callbackProcs[CB_EDITOR_ACTION] != null) {
      super.onEditorAction(actionCode);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_EDITOR_ACTION], "call" , JavaUtil.convertJavaToRuby(getRuby(), actionCode));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onEditorAction(actionCode);
    }
  }

  public void onEndBatchEdit() {
    if (callbackProcs[CB_END_BATCH_EDIT] != null) {
      super.onEndBatchEdit();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_END_BATCH_EDIT], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onEndBatchEdit();
    }
  }

  public boolean onPrivateIMECommand(java.lang.String action, android.os.Bundle data) {
    if (callbackProcs[CB_PRIVATE_I_M_E_COMMAND] != null) {
      super.onPrivateIMECommand(action, data);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_PRIVATE_I_M_E_COMMAND], "call" , JavaUtil.convertJavaToRuby(getRuby(), action), JavaUtil.convertJavaToRuby(getRuby(), data)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onPrivateIMECommand(action, data);
    }
  }

  public void onSelectionChanged(int selStart, int selEnd) {
    if (callbackProcs[CB_SELECTION_CHANGED] != null) {
      super.onSelectionChanged(selStart, selEnd);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_SELECTION_CHANGED], "call" , JavaUtil.convertJavaToRuby(getRuby(), selStart), JavaUtil.convertJavaToRuby(getRuby(), selEnd));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onSelectionChanged(selStart, selEnd);
    }
  }

  public boolean onTextContextMenuItem(int id) {
    if (callbackProcs[CB_TEXT_CONTEXT_MENU_ITEM] != null) {
      super.onTextContextMenuItem(id);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_TEXT_CONTEXT_MENU_ITEM], "call" , JavaUtil.convertJavaToRuby(getRuby(), id)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onTextContextMenuItem(id);
    }
  }

  public void onAnimationEnd() {
    if (callbackProcs[CB_ANIMATION_END] != null) {
      super.onAnimationEnd();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_ANIMATION_END], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onAnimationEnd();
    }
  }

  public void onAnimationStart() {
    if (callbackProcs[CB_ANIMATION_START] != null) {
      super.onAnimationStart();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_ANIMATION_START], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onAnimationStart();
    }
  }

  public void onAttachedToWindow() {
    if (callbackProcs[CB_ATTACHED_TO_WINDOW] != null) {
      super.onAttachedToWindow();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_ATTACHED_TO_WINDOW], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onAttachedToWindow();
    }
  }

  public void onCreateContextMenu(android.view.ContextMenu menu) {
    if (callbackProcs[CB_CREATE_CONTEXT_MENU] != null) {
      super.onCreateContextMenu(menu);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_CREATE_CONTEXT_MENU], "call" , JavaUtil.convertJavaToRuby(getRuby(), menu));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onCreateContextMenu(menu);
    }
  }

  public int[] onCreateDrawableState(int extraSpace) {
    if (callbackProcs[CB_CREATE_DRAWABLE_STATE] != null) {
      super.onCreateDrawableState(extraSpace);
      try {
        return (int[])RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_CREATE_DRAWABLE_STATE], "call" , JavaUtil.convertJavaToRuby(getRuby(), extraSpace)).toJava(int[].class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return null;
      }
    } else {
      return super.onCreateDrawableState(extraSpace);
    }
  }

  public void onDetachedFromWindow() {
    if (callbackProcs[CB_DETACHED_FROM_WINDOW] != null) {
      super.onDetachedFromWindow();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_DETACHED_FROM_WINDOW], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onDetachedFromWindow();
    }
  }

  public void onDraw(android.graphics.Canvas canvas) {
    if (callbackProcs[CB_DRAW] != null) {
      super.onDraw(canvas);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_DRAW], "call" , JavaUtil.convertJavaToRuby(getRuby(), canvas));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onDraw(canvas);
    }
  }

  public void onFinishInflate() {
    if (callbackProcs[CB_FINISH_INFLATE] != null) {
      super.onFinishInflate();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_FINISH_INFLATE], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onFinishInflate();
    }
  }

  public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
    if (callbackProcs[CB_FOCUS_CHANGED] != null) {
      super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_FOCUS_CHANGED], "call" , JavaUtil.convertJavaToRuby(getRuby(), gainFocus), JavaUtil.convertJavaToRuby(getRuby(), direction), JavaUtil.convertJavaToRuby(getRuby(), previouslyFocusedRect));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }
  }

  public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (callbackProcs[CB_KEY_DOWN] != null) {
      super.onKeyDown(keyCode, event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_KEY_DOWN], "call" , JavaUtil.convertJavaToRuby(getRuby(), keyCode), JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onKeyDown(keyCode, event);
    }
  }

  public boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) {
    if (callbackProcs[CB_KEY_MULTIPLE] != null) {
      super.onKeyMultiple(keyCode, repeatCount, event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_KEY_MULTIPLE], "call" , JavaUtil.convertJavaToRuby(getRuby(), keyCode), JavaUtil.convertJavaToRuby(getRuby(), repeatCount), JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onKeyMultiple(keyCode, repeatCount, event);
    }
  }

  public boolean onKeyShortcut(int keyCode, android.view.KeyEvent event) {
    if (callbackProcs[CB_KEY_SHORTCUT] != null) {
      super.onKeyShortcut(keyCode, event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_KEY_SHORTCUT], "call" , JavaUtil.convertJavaToRuby(getRuby(), keyCode), JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onKeyShortcut(keyCode, event);
    }
  }

  public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if (callbackProcs[CB_KEY_UP] != null) {
      super.onKeyUp(keyCode, event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_KEY_UP], "call" , JavaUtil.convertJavaToRuby(getRuby(), keyCode), JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onKeyUp(keyCode, event);
    }
  }

  public void onLayout(boolean changed, int left, int top, int right, int bottom) {
    if (callbackProcs[CB_LAYOUT] != null) {
      super.onLayout(changed, left, top, right, bottom);
      try {
        IRubyObject[] args = {JavaUtil.convertJavaToRuby(getRuby(), changed), JavaUtil.convertJavaToRuby(getRuby(), left), JavaUtil.convertJavaToRuby(getRuby(), top), JavaUtil.convertJavaToRuby(getRuby(), right), JavaUtil.convertJavaToRuby(getRuby(), bottom)};
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_LAYOUT], "call" , args);
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onLayout(changed, left, top, right, bottom);
    }
  }

  public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    if (callbackProcs[CB_MEASURE] != null) {
      super.onMeasure(widthMeasureSpec, heightMeasureSpec);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_MEASURE], "call" , JavaUtil.convertJavaToRuby(getRuby(), widthMeasureSpec), JavaUtil.convertJavaToRuby(getRuby(), heightMeasureSpec));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
  }

  public void onScrollChanged(int l, int t, int oldl, int oldt) {
    if (callbackProcs[CB_SCROLL_CHANGED] != null) {
      super.onScrollChanged(l, t, oldl, oldt);
      try {
        IRubyObject[] args = {JavaUtil.convertJavaToRuby(getRuby(), l), JavaUtil.convertJavaToRuby(getRuby(), t), JavaUtil.convertJavaToRuby(getRuby(), oldl), JavaUtil.convertJavaToRuby(getRuby(), oldt)};
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_SCROLL_CHANGED], "call" , args);
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onScrollChanged(l, t, oldl, oldt);
    }
  }

  public boolean onSetAlpha(int alpha) {
    if (callbackProcs[CB_SET_ALPHA] != null) {
      super.onSetAlpha(alpha);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_SET_ALPHA], "call" , JavaUtil.convertJavaToRuby(getRuby(), alpha)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onSetAlpha(alpha);
    }
  }

  public void onSizeChanged(int w, int h, int oldw, int oldh) {
    if (callbackProcs[CB_SIZE_CHANGED] != null) {
      super.onSizeChanged(w, h, oldw, oldh);
      try {
        IRubyObject[] args = {JavaUtil.convertJavaToRuby(getRuby(), w), JavaUtil.convertJavaToRuby(getRuby(), h), JavaUtil.convertJavaToRuby(getRuby(), oldw), JavaUtil.convertJavaToRuby(getRuby(), oldh)};
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_SIZE_CHANGED], "call" , args);
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onSizeChanged(w, h, oldw, oldh);
    }
  }

  public boolean onTouchEvent(android.view.MotionEvent event) {
    if (callbackProcs[CB_TOUCH_EVENT] != null) {
      super.onTouchEvent(event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_TOUCH_EVENT], "call" , JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onTouchEvent(event);
    }
  }

  public boolean onTrackballEvent(android.view.MotionEvent event) {
    if (callbackProcs[CB_TRACKBALL_EVENT] != null) {
      super.onTrackballEvent(event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_TRACKBALL_EVENT], "call" , JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onTrackballEvent(event);
    }
  }

  public void onWindowFocusChanged(boolean hasWindowFocus) {
    if (callbackProcs[CB_WINDOW_FOCUS_CHANGED] != null) {
      super.onWindowFocusChanged(hasWindowFocus);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_WINDOW_FOCUS_CHANGED], "call" , JavaUtil.convertJavaToRuby(getRuby(), hasWindowFocus));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onWindowFocusChanged(hasWindowFocus);
    }
  }

  public void onWindowVisibilityChanged(int visibility) {
    if (callbackProcs[CB_WINDOW_VISIBILITY_CHANGED] != null) {
      super.onWindowVisibilityChanged(visibility);
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_WINDOW_VISIBILITY_CHANGED], "call" , JavaUtil.convertJavaToRuby(getRuby(), visibility));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onWindowVisibilityChanged(visibility);
    }
  }

  public boolean onCheckIsTextEditor() {
    if (callbackProcs[CB_CHECK_IS_TEXT_EDITOR] != null) {
      super.onCheckIsTextEditor();
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_CHECK_IS_TEXT_EDITOR], "call" ).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onCheckIsTextEditor();
    }
  }

  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    if (callbackProcs[CB_CREATE_INPUT_CONNECTION] != null) {
      super.onCreateInputConnection(outAttrs);
      try {
        return (android.view.inputmethod.InputConnection)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_CREATE_INPUT_CONNECTION], "call" , JavaUtil.convertJavaToRuby(getRuby(), outAttrs)).toJava(android.view.inputmethod.InputConnection.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return null;
      }
    } else {
      return super.onCreateInputConnection(outAttrs);
    }
  }

  public void onFinishTemporaryDetach() {
    if (callbackProcs[CB_FINISH_TEMPORARY_DETACH] != null) {
      super.onFinishTemporaryDetach();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_FINISH_TEMPORARY_DETACH], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onFinishTemporaryDetach();
    }
  }

  public boolean onKeyPreIme(int keyCode, android.view.KeyEvent event) {
    if (callbackProcs[CB_KEY_PRE_IME] != null) {
      super.onKeyPreIme(keyCode, event);
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_KEY_PRE_IME], "call" , JavaUtil.convertJavaToRuby(getRuby(), keyCode), JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return super.onKeyPreIme(keyCode, event);
    }
  }

  public void onStartTemporaryDetach() {
    if (callbackProcs[CB_START_TEMPORARY_DETACH] != null) {
      super.onStartTemporaryDetach();
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_START_TEMPORARY_DETACH], "call" );
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    } else {
      super.onStartTemporaryDetach();
    }
  }

  public boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) {
    if (callbackProcs[CB_KEY_LONG_PRESS] != null) {
      try {
        return (Boolean)RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_KEY_LONG_PRESS], "call" , JavaUtil.convertJavaToRuby(getRuby(), keyCode), JavaUtil.convertJavaToRuby(getRuby(), event)).toJava(boolean.class);
      } catch (RaiseException re) {
        re.printStackTrace();
        return false;
      }
    } else {
      return false;
    }
  }

  public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    if (callbackProcs[CB_CONFIGURATION_CHANGED] != null) {
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_CONFIGURATION_CHANGED], "call" , JavaUtil.convertJavaToRuby(getRuby(), newConfig));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    }
  }

  public void onDisplayHint(int hint) {
    if (callbackProcs[CB_DISPLAY_HINT] != null) {
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_DISPLAY_HINT], "call" , JavaUtil.convertJavaToRuby(getRuby(), hint));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    }
  }

  public void onVisibilityChanged(android.view.View changedView, int visibility) {
    if (callbackProcs[CB_VISIBILITY_CHANGED] != null) {
      try {
        RuntimeHelpers.invoke(getRuby().getCurrentContext(), callbackProcs[CB_VISIBILITY_CHANGED], "call" , JavaUtil.convertJavaToRuby(getRuby(), changedView), JavaUtil.convertJavaToRuby(getRuby(), visibility));
      } catch (RaiseException re) {
        re.printStackTrace();
      }
    }
  }
}
