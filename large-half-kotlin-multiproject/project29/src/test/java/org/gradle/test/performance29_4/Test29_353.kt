package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_353 {
    private val production = Production29_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}