package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_163 {
    private val production = Production9_163("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}