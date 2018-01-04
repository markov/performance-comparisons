package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_367 {
    private val production = Production9_367("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}