package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_172 {
    private val production = Production9_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}