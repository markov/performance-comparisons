package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_165 {
    private val production = Production9_165("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}