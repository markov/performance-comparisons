package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_170 {
    private val production = Production9_170("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}