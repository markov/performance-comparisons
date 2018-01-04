package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_40 {
    private val production = Production9_40("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}