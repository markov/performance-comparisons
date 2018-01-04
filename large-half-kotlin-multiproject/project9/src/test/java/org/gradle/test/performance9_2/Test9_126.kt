package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_126 {
    private val production = Production9_126("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}