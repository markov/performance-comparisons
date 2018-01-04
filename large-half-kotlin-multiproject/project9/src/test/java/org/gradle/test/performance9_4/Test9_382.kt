package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_382 {
    private val production = Production9_382("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}