/*
 * Copyright 2014 wada811
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wada811.android.dialogfragments.sample.alertdialogfragment.examples.traditional;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.method.CharacterPickerDialog;
import com.wada811.android.dialogfragments.traditional.AlertDialogFragment;
import com.wada811.android.dialogfragments.interfaces.DialogFragmentCallbackProvider;
import com.wada811.android.dialogfragments.sample.Example;
import com.wada811.android.dialogfragments.sample.R;

public class MultiChoiceAlertDialogExample extends Example {

    private Context context;

    public MultiChoiceAlertDialogExample(Context context){
        super(MultiChoiceAlertDialogExample.class.getSimpleName() + "(Traditional)");
        this.context = context;
    }

    @Override
    public void showDialog(DialogFragmentCallbackProvider provider, FragmentManager fragmentManager){
        String[] items = new String[]{
            AlertDialog.class.getSimpleName(),
            CharacterPickerDialog.class.getSimpleName(),
            ProgressDialog.class.getSimpleName(),
            DatePickerDialog.class.getSimpleName(),
            TimePickerDialog.class.getSimpleName(),
        };
        boolean[] checkedItems = {
            true,
            false,
            true,
            false,
            true
        };
        Bundle extra = new Bundle();
        extra.putStringArray("items", items);
        new AlertDialogFragment.Builder(context).setIcon(R.drawable.ic_launcher)
            .setTitle(R.string.dialog_title)
            .setMultiChoiceItems(items, checkedItems)
            .setExtra(extra)
            .setPositiveButton(R.string.dialog_ok, null)
            .setNegativeButton(R.string.dialog_cancel, null)
            .show(fragmentManager, label);
    }

}
