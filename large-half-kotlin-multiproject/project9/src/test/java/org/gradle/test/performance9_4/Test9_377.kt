package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_377 {
    private val production = Production9_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}