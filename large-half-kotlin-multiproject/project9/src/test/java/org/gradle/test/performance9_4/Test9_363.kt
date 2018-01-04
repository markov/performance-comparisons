package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_363 {
    private val production = Production9_363("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}