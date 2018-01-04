package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_2 {
    private val production = Production9_2("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}