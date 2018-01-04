package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_18 {
    private val production = Production9_18("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}