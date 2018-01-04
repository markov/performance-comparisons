package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_403 {
    private val production = Production9_403("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}