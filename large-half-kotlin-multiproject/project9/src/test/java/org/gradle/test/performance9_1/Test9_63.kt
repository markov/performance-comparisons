package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_63 {
    private val production = Production9_63("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}