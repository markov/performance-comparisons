package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_360 {
    private val production = Production9_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}