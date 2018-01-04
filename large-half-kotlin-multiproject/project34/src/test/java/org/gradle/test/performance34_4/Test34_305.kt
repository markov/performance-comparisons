package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_305 {
    private val production = Production34_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}