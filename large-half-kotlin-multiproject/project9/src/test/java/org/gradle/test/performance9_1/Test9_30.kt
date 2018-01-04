package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_30 {
    private val production = Production9_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}